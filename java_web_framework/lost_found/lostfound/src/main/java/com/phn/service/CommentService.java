/**
 * 
 */
package com.phn.service;

import com.phn.entity.Comment;

/**
 * @author admin
 * @date 2014-10-18
 */
public interface CommentService {
	public boolean insert(Comment comment);
	public boolean update(Comment comment);
	public Comment find(int index);
	public boolean delete(int index);
}
