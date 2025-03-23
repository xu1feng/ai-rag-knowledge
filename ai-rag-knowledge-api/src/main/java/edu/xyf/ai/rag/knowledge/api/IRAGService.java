package edu.xyf.ai.rag.knowledge.api;

import edu.xyf.ai.rag.knowledge.api.response.Response;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

/**
 * @author Xuyifeng
 * @description
 * @date 2025/3/23 14:38
 */

public interface IRAGService {

    Response<List<String>> queryRagTagList();

    Response<String> uploadFile(String ragTag, List<MultipartFile> files);

    Response<String> analyseGitRepository(String repoUrl, String userName, String token) throws Exception;

}
