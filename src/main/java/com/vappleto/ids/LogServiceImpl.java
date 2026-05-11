package com.vappleto.ids;

import io.grpc.stub.StreamObserver;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class LogServiceImpl extends LogServiceGrpc.LogServiceImplBase {

    @Override
    public void sendLog(LogRequest request, StreamObserver<LogResponse> responseObserver) {

        String formattedTime = Instant
                .ofEpochMilli(request.getTimestamp())
                .atZone(ZoneId.systemDefault())
                .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        System.out.println("\n=== INTRUSION ALERT ===");

        System.out.println("Node ID: "
                + request.getNodeId());

        System.out.println("Source IP: "
                + request.getSourceIp());

        System.out.println("Destination IP: "
                + request.getDestinationIp());

        System.out.println("Attack Type: "
                + request.getAttackType());

        System.out.println("Severity: "
                + request.getSeverity());

        System.out.println("Description: "
                + request.getDescription());

        System.out.println("Timestamp: "
                + formattedTime);

        System.out.println("========================\n");


        LogResponse response = LogResponse.newBuilder()
                .setSuccess(true)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();



    }
}
