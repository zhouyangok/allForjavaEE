package com.crazyang.thread;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @ClassName ThreadDemo
 * @Description: TODO
 * @Author zhouyang
 * @Date 2019/5/22 下午8:52.
 */

public class ThreadDemo {


    private static ThreadLocal<Connection> threadLocal = new ThreadLocal<Connection>();

    public static Connection getConnection() {
        Connection conn = threadLocal.get();
        try {
            if (conn == null || conn.isClosed()) {
                threadLocal.set(conn);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static void closed(){
        // 获取当前线程内共享的Connection
        Connection conn = threadLocal.get();
        try {
            // 判断是否已经关闭
            if(conn != null && !conn.isClosed()) {
                // 关闭资源
                conn.close();
                // 移除Connection
                threadLocal.remove();
                conn = null;
            }
        } catch (SQLException e) {
            // 异常处理
        }

    }

    public static void main(String[] args) {

    }
}
