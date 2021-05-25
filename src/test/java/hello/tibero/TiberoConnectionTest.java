package hello.tibero;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;

public class TiberoConnectionTest {

    @Test
    public void testConnection() {
        try(Connection conn = DriverManager.getConnection("jdbc:tibero:thin:@192.168.179.236:8629:tibero", "hr", "hr")) {
            System.out.println("SUCCESS !!");
        } catch(Exception e) {
            Assertions.fail();
        }
    }
}
