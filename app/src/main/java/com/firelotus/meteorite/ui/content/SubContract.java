package com.firelotus.meteorite.ui.content;

import com.firelotus.meteorite.ui.bean.EveryDayBean;
import com.firelotus.meteorite.ui.bean.GankBean;
import com.firelotus.meteoritelibrary.base.BasePresenter;
import com.firelotus.meteoritelibrary.base.BaseView;

import java.util.ArrayList;

/**
 * Created by firelotus on 2017/10/15.
 */

public interface SubContract {
    interface View extends BaseView<Presenter> {
        void onContentSuccess(ArrayList<GankBean> list);
        void onEveryDaySuccess(EveryDayBean everyDayBean);
    }
    interface Presenter extends BasePresenter {
        void getContent(String type,int pageIndex, int pageSize);
        void getEveryDay(String year, String month, String day);
    }
}
