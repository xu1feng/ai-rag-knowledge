package edu.xyf.ai.rag.knowledge.api;

import edu.xyf.ai.rag.knowledge.api.response.Response;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @author Xuyifeng
 * @description
 * @date 2025/3/23 14:38
 */

public interface IRAGService {

    Response<List<String>> queryRagTagList();

    Response<String> uploadFile(String ragTag, List<MultipartFile> files);

}
