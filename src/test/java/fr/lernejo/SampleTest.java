package fr.lernejo;


import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class SampleTest {

    private final Sample sample = new Sample();
    @Test
    public  void multi_behaves_as_expected() {
        int result = sample.op(Sample.Operation.MULT, 3, 4);

        assertThat(result).isEqualTo(12);
    }

    @Test
    public void add_behaves_as_expected(){
        int result = sample.op(Sample.Operation.ADD, 5, 5);

        assertThat(result).isEqualTo(10);
    }
}
