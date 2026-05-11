package com.vappleto.ids;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import java.io.IOException;


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
