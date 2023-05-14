package com.company.depinv;

import java.io.IOException;
import java.io.PrintWriter;

public class MessagePrinter {
    // Writes message to a file
    // accept as method param instead of instantiating dependency ourselves
    public void writeMessage(Message msg, Formatter formatter, PrintWriter writer)
            throws IOException {
        writer.println(formatter.format(msg)); // formats and writes message
        writer.flush();
    }
}
