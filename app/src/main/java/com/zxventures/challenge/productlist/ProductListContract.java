package com.zxventures.challenge.productlist;

final class ProductListContract {

    private ProductListContract() {
    }

    interface ViewContract {

    }

    interface ModelContract {
        void setPresenter(PresenterModelContract presenter);
    }

    interface PresenterModelContract {

    }

    interface PresenterViewContract {
        void attachView(ViewContract view);

        void detachView();
    }
}