package com.tydic.persist.common;

import java.util.List;
import java.util.Map;

import com.tydic.common.Pager;

/**
 * 通用Mapper接口
 *
 * @param <T>
 *            实体类型
 * @param <K>
 *            主键类型
 */
public interface BaseMapper<T, K> {

	/**
	 * 根据主键查找记录, 返回对应记录
	 */
	T getById(K id);

	/**
	 * 根据主键批量查找对应的记录, 返回对应记录
	 */
	List<T> getByIds(List<K> ids);

	/**
	 * 根据pojo熟悉查找记录, 返回对应记录
	 */
	List<T> getByPojo(T pojo);

	/**
	 * 根据条件查找记录, 返回对应记录
	 */
	List<T> getByCondition(Map<String, String> map);

	/**
	 * 分页查询, 返回分页列表
	 */
	<M> List<M> getByPageList(Pager<M> page);

	/**
	 * 分页查询, 返回总记录数
	 */
	<M> Integer getByPageCount(Pager<M> page);

	/**
	 * 查询所有记录
	 */
	List<T> getAll();

	/**
	 * 查询总记录数
	 */
	Integer getAllCount();

	/**
	 * 修改记录, 返回修改的记录数
	 */
	Integer modify(T record);

	/**
	 * 选择性的修改记录, 返回修改的记录数
	 */
	Integer modifySelective(T record);

	/**
	 * 插入记录, 返回插入记录数(0 or 1)
	 */
	Integer save(T record);

	/**
	 * mysql批量插入记录, 返回插入记录条数.
	 */
	Integer saveBatch(List<T> records);

	/**
	 * 根据主键删除, 返回删除记录数
	 */
	Integer delById(K id);

	/**
	 * 根据主键批量删除, 返回删除记录数, 注意: 联合主键, 不支持该操作
	 */
	Integer delByIds(List<K> ids);

}