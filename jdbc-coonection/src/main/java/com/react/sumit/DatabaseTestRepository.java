package com.react.sumit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DatabaseTestRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int getRecordCount() {
        String sql = "SELECT COUNT(*) FROM your_table_name"; // Change to your actual table
        return jdbcTemplate.queryForObject(sql, Integer.class);
    }
}
