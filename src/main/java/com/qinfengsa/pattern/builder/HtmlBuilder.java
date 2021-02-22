package com.qinfengsa.pattern.builder;

import cn.hutool.core.io.IoUtil;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;

/**
 * @author qinfengsa
 * @date 2021/1/4 14:12
 */
@Slf4j
public class HtmlBuilder implements Builder {

    private String fileName;

    private PrintWriter writer;

    @Override
    public void makeTitle(String title) {
        fileName = title + ".html";

        try {
            writer = new PrintWriter(fileName);
        } catch (FileNotFoundException e) {
            log.error(e.getMessage(), e);
        }
        writer.println("<html><head><title>" + title + "</title></head><body>");

        writer.println("<h1>" + title + "</h1>");
    }

    @Override
    public void makeString(String str) {
        writer.println("<p>" + str + "</p>");
    }

    @Override
    public void makeItems(String[] items) {
        writer.println("<ul>");
        Arrays.stream(items).forEach(item -> writer.println("<li>" + item + "</li>"));
        writer.println("</ul>");
    }

    @Override
    public void close() {
        writer.println("</body></html>");
        IoUtil.close(writer);
    }

    public String getResult() {
        return fileName;
    }
}
