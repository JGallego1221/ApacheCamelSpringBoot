package com.mine.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class FileTransferRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("file:input_folder?noop=true")
                .to("file:output_folder");
    }
}
