/// ***************************************************************************
/// Copyright (c) 2010, Industrial Logic, Inc., All Rights Reserved.
///
/// This code is the exclusive property of Industrial Logic, Inc. It may ONLY be
/// used by students during Industrial Logic's workshops or by individuals
/// who are being coached by Industrial Logic on a project.
///
/// This code may NOT be copied or used for any other purpose without the prior
/// written consent of Industrial Logic, Inc.
/// ****************************************************************************

package com.industriallogic.collections;

public abstract class AbstractCollection implements Collection {
	protected static int INITIAL_CAPACITY = 10;
	protected int size = 0;
	protected Object[] elements = new Object[INITIAL_CAPACITY];
	protected boolean readOnly;

	public void addAll(AbstractCollection c) {
		for (int i=0; i < c.size(); i++) {
			if (!contains(c.get(i))) {
				add(c.get(i));
			}
		}
	}
	
	public void add(Object key, Object value) {
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public int size() {
		return size;
	}

	public int capacity() {
		return elements.length;
	}

	public boolean contains(Object element) {
		for (int i = 0; i < size; i++) 
			if (elements[i].equals(element))
				return true;
		return false;
	}

	protected void grow() {
		Object[] newElements =
			new Object[elements.length + INITIAL_CAPACITY];
		for (int i = 0; i < size; i++)
			newElements[i] = elements[i];
		elements = newElements;
	}

	protected boolean shouldGrow() {
		return size + 1 > elements.length;
	}

	protected void addElement(Object element) {
		elements[size++] = element;
	}

	public boolean remove(Object element) {
		if (readOnly)
			return false;
		else
			for (int i = 0; i < size; i++)
				if (elements[i].equals(element)) {
					elements[i] = null;
					Object[] newElements = new Object[size - 1];
					int k = 0;
					for (int j = 0; j < size; j++) {
						if (elements[j] != null)
							newElements[k++] = elements[j];
					}
					size--;
					elements = newElements;
					return true;
				}
		return false;
	}

	public void setReadOnly(boolean b) {
		readOnly = b;
	}

	public void add(Object element) {
		if (readOnly)
			return;
	
		if (shouldGrow()) {
			grow();
		}
		addElement(element);
	}

	public Object get(int i) {
		return elements[i];
	}
}
