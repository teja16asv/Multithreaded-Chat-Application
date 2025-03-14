# Multithreaded-Chat-Application
*COMPANY*: CODTECH IT SOLUTIONS

*NAME*: ATYAM SRI VIJAYA TEJA

*INTERN ID*: CTO8SEF

*DOMAIN*: JAVA PROGRAMMING

*MENTOR*: NEELA SANTHOSH

This project implements a real-time chat application using Java sockets and multithreading. It consists of a server that manages multiple client connections and facilitates seamless communication between users.

Features
Client-Server Architecture: A centralized server handles multiple clients simultaneously.
Multithreading: Each client connection runs on a separate thread, ensuring smooth communication.
Real-Time Messaging: Clients can send and receive messages instantly.
Efficient Communication: Uses TCP sockets for reliable data transfer.
Scalability: Designed to support multiple users without performance degradation.
Technologies Used
Java (JDK 8+)
Socket Programming (ServerSocket and Socket)
Multithreading (Thread and ExecutorService)
I/O Streams (BufferedReader, PrintWriter)
How It Works
The server starts and listens for incoming client connections.
When a client connects, the server assigns it a dedicated thread.
Clients can send messages, which the server broadcasts to all connected users.
The application ensures smooth message delivery and handles client disconnections gracefully.
This project is a practical implementation of socket programming and multithreading in Java, demonstrating efficient network communication. It is ideal for learning real-time client-server interaction and concurrency management.
