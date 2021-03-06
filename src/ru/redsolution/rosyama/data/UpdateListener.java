package ru.redsolution.rosyama.data;

/**
 * Интерфейс для получения извещения об изменениях состояния.
 * 
 * @author alexander.ivanov
 * 
 */
public interface UpdateListener {
	/**
	 * Должно вызываться в UI потоке после каждого изменения данных приложения.
	 */
	void onUpdate();
}
