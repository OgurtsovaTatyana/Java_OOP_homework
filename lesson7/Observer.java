package lesson7;

/**
 * Интерфейс наблюдателя (соискателя, человек в поисках работы)
 */
public interface Observer {
    void receiveOffer(JobVacancy jobVacancy); // получить предложение от компании

}
