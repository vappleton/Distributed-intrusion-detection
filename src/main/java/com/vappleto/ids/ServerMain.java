package com.vappleto.ids;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import java.io.IOException;

/**
 * Entry point for the centralized IDS monitoring server.
 *
 * The server listens for incoming gRPC intrusion alert requests from distributed IDS nodes and processes
 * intrusion event data in real time.
 *
 * The server registers the LogServiceImpl gRPC service implementation and listens on port 50051.
 *
 * @author Virginia Appleton
 */
public class ServerMain {

    public static void main(String[] args) throws IOException, InterruptedException {

        //build Server
        Server server = ServerBuilder
                .forPort(50051)
                .addService(new LogServiceImpl())
                .build();
        server.start();

        System.out.println("Server started on port 50051");

        server.awaitTermination();

    }
}
