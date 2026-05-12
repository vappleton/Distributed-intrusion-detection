# Distributed-intrusion-detection (IDS)

A distributed Intrusion Detection System (IDS) simulation built with Java, gRPC, and Protocol Buffers. The system simulates multiple network nodes generating randomized intrusion alerts and sending them to a centralized monitoring server using remote procedure calls (RPCs).  
The project demonstrates distributed communication, Protocol Buffer serialization, gRPC client/server architecture, and real-time event processing.

---

# Features
- gRPC-based distributed communication
- Protocol Buffers message serialization
- Centralized IDS monitoring server
- Simulated distributed IDS nodes
- Randomized intrusion alert generation
- Randomized internal and external IP addresses
- Attack severity classification
- Dynamic attack descriptions
- Human-readable timestamp formatting
- Real-time intrusion event logging

---

# Skills Used

- Java
- gRPC
- Protocol Buffers (protobuf)
- Gradle

---

# Project Architecture
```text
IDS Node Clients
        ↓
gRPC Communication
        ↓
Central Monitoring Server
        ↓
Intrusion Alert Processing
```
# Simulated Attack Types

The system currently simulates attacks such as:

- Port Scan
- SQL Injection
- Brute Force Login
- DDoS Attempt
- Malware Traffic
- Unauthorized Access
- Phishing Attempt
- Suspicious DNS Activity  
---

# Example output
=== INTRUSION ALERT ===  
Node ID: Node-3  
Source IP: 83.212.44.19  
Destination IP: 192.168.1.33  
Attack Type: SQL Injection  
Severity: HIGH  
Description: Malicious SQL patterns detected  
Timestamp: 2026-05-08 22:15:33
========================
---

# Running the project 

1. **Clone the repository** 
- git clone https://github.com/vappleton/Distributed-intrusion-detection.git  
- cd Distributed-intrusion-detection  
   
2. **Build the project:**  
./gradlew build  


3. **Run the Server**  
./gradlew runServer or gradle runServer  


4. **Run the Client**  
./gradlew runClient or gradle runClient  
The client simulates  and IDS node and sends randomized intrusion alerts to the server. 


5. **Running Tests**  
./gradlew test
---

# Protocol buffers

The system uses a .proto file to define:  
- gRPC services  
- request/response messages
- RPC communication contracts
---

# Future improvements  
Potential future improvements include:  
- Persistent intrusion logging
- Multiple concurrent IDS Nodes
- Machine learning-based intrusion detection
- Python-based detection engine integration
---

# Author

Virginia Appleton 
    