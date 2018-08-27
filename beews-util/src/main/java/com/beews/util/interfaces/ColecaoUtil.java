package com.beews.util.interfaces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ColecaoUtil {

	private ColecaoUtil() {
		throw new IllegalStateException("Util Class");
	}

	public static <E> List<E> getList(List<E> colecao) {
		return colecao != null ? colecao : new ArrayList<>();

	}

	public static <K, V> Map<K, V> getList(Map<K, V> colecao) {
		return colecao != null ? colecao : new HashMap<>();
	}

}
