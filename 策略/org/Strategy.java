package org;

import java.util.ArrayList;

//这就是策略
interface Strategy {
    void setList(ArrayList list);

    void findMax();

    int getRes();
}
