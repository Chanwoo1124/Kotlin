import org.jetbrains.annotations.NotNull;

import javax.xml.transform.Result;

public class JavaMoney implements Comparable<JavaMoney> {
    private final Long money;

    public JavaMoney(Long money) {
        this.money = money;
    }

    @Override
    public int compareTo(@NotNull JavaMoney o) {
        return Long.compare(this.money, o.money);
    }
}
