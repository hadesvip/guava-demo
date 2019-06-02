package com.bean.base;

import java.util.List;
import java.util.Set;

/**
 * 基本mapper
 * @author: wangyong
 * @date: 2019/6/2 18:55
 */
public interface BeanMapper<D, E> {

	/**
	 * 将源对象转换为目标对象
	 * @param e
	 * @return D
	 */
	D toDTO(E e);

	/**
	 * 将源对象集合转换为目标对象集合
	 * @param es
	 * @return List<D>
	 */
	List<D> toDTO(List<E> es);

	/**
	 * 将源对象集合转换为目标对象集合
	 * @param es
	 * @return Set<D>
	 */
	Set<D> toDTO(Set<E> es);

	/**
	 * 将目标对象转换为源对象
	 * @param d
	 * @return E
	 */
	E toEntity(D d);

	/**
	 * 将目标对象集合转换为源对象集合
	 * @param ds
	 * @return List<E>
	 */
	List<E> toEntity(List<D> ds);

	/**
	 * 将目标对象集合转换为源对象集合
	 * @param ds
	 * @return Set<E>
	 */
	Set<E> Set(List<D> ds);
}
