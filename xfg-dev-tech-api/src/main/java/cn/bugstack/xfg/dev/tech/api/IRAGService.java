package cn.bugstack.xfg.dev.tech.api;

import cn.bugstack.xfg.dev.tech.api.response.Response;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @Author: Xuyifeng
 * @Description:
 * @Date: 2025/9/24 16:37
 */

public interface IRAGService {

    Response<List<String>> queryRagTagList();

    Response<String> uploadFile(String ragTag, List<MultipartFile> files);

}
