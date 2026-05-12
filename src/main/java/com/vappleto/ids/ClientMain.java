package com.vappleto.ids;

import java.util.Random;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

/**
 * Simulates a distributed IDS node client that generates randomized intrusiond etection alerts and sends them to
 * a centralized gRPC monitoring server
 *
 * The client creates randomized attack events including: source and destination  IP addresses, attack type,
 * severity level, and descriptive intrusiond etails.
 *
 * Communication with the monitoring server is performed using gRPC and Protocol Buffers.
 *
 * @Author Virginia Appleton
 */

public class ClientMain {

    private static final Random random = new Random();

    private static final String[] attackTypes = {
            "Port Scan",
            "SQL Injection",
            "DDoS Attempt",
            "Malware Traffic",
            "Unauthorized Access",
            "Phishing Attempt",
            "Suspicious DNS Activity"
    };

    private static final String[] severityLevels = {
            "LOW",
            "MEDIUM",
            "HIGH",
            "CRITICAL"
    };

    public static void main(String[] args) {
        //create channel
        ManagedChannel channel = ManagedChannelBuilder
                .forAddress("localhost", 50051)
                .usePlaintext()
                .build();

        LogServiceGrpc.LogServiceBlockingStub stub =
                LogServiceGrpc.newBlockingStub(channel);

        String attackType = randomAttackType();


        //build the request
        LogRequest request = LogRequest.newBuilder()
                .setNodeId(generateNodeId())
                .setSourceIp(generateExternalIp())
                .setDestinationIp(generateInternalIp())
                .setAttackType(attackType)
                .setSeverity(randomSeverityLevel())
                .setDescription(generateDescription(attackType))
                .setTimestamp(System.currentTimeMillis())
                .build();

        LogResponse response = stub.sendLog(request);

        System.out.println("Server response: " + response.getSuccess());

        channel.shutdown();


    }
    static String generateInternalIp() {
        return "192.168."
                + (int)(Math.random() * 256)
                + "."
                + (int)(Math.random() * 256);
    }
    static String generateExternalIp() {
        return (20 + (int)(Math.random() * 200)) +
                "."
                + (int)(Math.random() * 256) + "."
                + (int)(Math.random() * 256) + "."
                + (int)(Math.random() * 256);
    }
    private static String generateNodeId() {

        return "Node-" + (random.nextInt(5) + 1);
    }

    static String randomAttackType() {
        return attackTypes[random.nextInt(attackTypes.length)];
    }
    static String randomSeverityLevel() {
        return severityLevels[random.nextInt(severityLevels.length)];
    }

    static String generateDescription(String attackType) {
        return switch (attackType) {

            case "Port Scan" -> "Multiple ports probed rapidly";
            case "SQL Injection" -> "Malicious SQL patterns detected";
            case "Brute Force Login"  -> "Repeated failed login attempts";
            case "DDoS attempt" -> " High traffic spike detected";
            case "Malware Traffic" -> "Known malicious traffic signature detected";
            case "Unauthorized Access" -> "Restricted resource access attempt";
            case "Phishing Attempt" -> "Suspicious email activity detected";
            default -> "Suspicious network behavior detected";
        };
    }


}
