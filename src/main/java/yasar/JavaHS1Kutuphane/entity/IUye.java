package yasar.JavaHS1Kutuphane.entity;

import java.util.List;

public interface IUye<T> {
    void kitapOduncAl(T entity);

    void kitapIadeEt(T entity);

    List<T> oduncKitaplar();
}
