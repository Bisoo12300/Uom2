package com.example.uom.core.add;

import com.example.uom.R;
import com.example.uom.base.BasePresenter;
import com.example.uom.model.UserPlant;

public class AddPresenter extends BasePresenter
        implements AddContract.Presenter, AddContract.Listener {

    private AddContract.View addView;
    private AddContract.Interactor addInteractor;

    public AddPresenter(AddContract.View addView) {
        super(addView);
        this.addView = addView;
        this.addInteractor = new AddInteractor(this);
    }

    @Override
    public void addPlant(UserPlant plant) {
        if (isPlantCorrect(plant))
            addInteractor.performAddPlant(plant);
    }

    private boolean isPlantCorrect(UserPlant plant) {
        if (!plant.getName().isEmpty())
            return true;

        addView.setNameError(R.string.this_field_cant_be_empty);
        return false;
    }

    @Override
    public void onSuccess(int message, UserPlant plant) {
        addView.plantAdded(message, plant);
    }

    @Override
    public void onFailure(String message) {
        addView.showMessage(message);
    }
}
