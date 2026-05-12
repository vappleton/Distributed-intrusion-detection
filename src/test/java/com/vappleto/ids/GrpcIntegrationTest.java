package com.vappleto.ids;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GrpcIntegrationTest {
    private static Server server;

    @BeforeAll
    public static void setup() throws Exception{

        server = ServerBuilder
                .forPort(50052) //different port from main application
                .addService(new LogServiceImpl())
                .build()
                .start();
    }
    @AfterAll
    public static void teardown() throws Exception{
        server.shutdown();
    }

    @Test
    public void testSendLog() {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50052)
                .usePlaintext()
                .build();

        LogServiceGrpc.LogServiceBlockingStub stub = LogServiceGrpc.newBlockingStub(channel);

        LogRequest request = LogRequest.newBuilder()
                .setNodeId("Test-Node")
                .setSourceIp("1.1.1.1")
                .setDestinationIp("192.168.1.10")
                .setAttackType("Port Scan")
                .setSeverity("HIGH")
                .setDescription("Test intrusion")
                .setTimestamp(System.currentTimeMillis())
                .build();

        LogResponse response = stub.sendLog(request);
        assertTrue(response.getSuccess());
        channel.shutdown();
    }

}
