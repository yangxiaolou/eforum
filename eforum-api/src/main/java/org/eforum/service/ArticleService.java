package org.eforum.service;

import java.util.List;

import org.eforum.entity.Article;
import org.springframework.data.domain.Page;
import org.springframework.web.multipart.MultipartFile;

public interface ArticleService {
	Page<Article> listArticle(int pageNumber, int pageSize);

	Article findArticleById(Long id);

	List<Article> findSuggestionArticle(int pageSize);

	/**
	 * 保存或者更新帖子
	 * 
	 * @param article
	 * @return
	 */
	Article saveOrUpdate(Article article);

	/**
	 * 保存帖子的图片。只是预先保存，如果是第一次发帖，则还没有帖子ID，但是图片需要先行保存。
	 * 
	 * @param images
	 * @return
	 */
	List<String> saveImagesOfArticle(MultipartFile[] images);
}