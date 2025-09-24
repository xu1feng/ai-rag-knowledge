package cn.bugstack.xfg.dev.tech.api;

import org.springframework.ai.chat.ChatResponse;
import reactor.core.publisher.Flux;

/**
 * @Author: Xuyifeng
 * @Description:
 * @Date: 2025/9/24 14:45
 */

public interface IAiService {

    ChatResponse generate(String model, String message);

    Flux<ChatResponse> generateStream(String model, String message);

}
