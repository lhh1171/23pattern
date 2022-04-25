package org;

import java.util.ArrayList;

interface Strategy {
    void setList(ArrayList list);

    void findMax();

    int getRes();
}//这就是策略
