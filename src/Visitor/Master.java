package Visitor;

public interface Master {
    void create(FirstDetail firstDetail);
    void create(SecondDetail secondDetail);
    void create(ThirdDetail thirdDetail);
}
