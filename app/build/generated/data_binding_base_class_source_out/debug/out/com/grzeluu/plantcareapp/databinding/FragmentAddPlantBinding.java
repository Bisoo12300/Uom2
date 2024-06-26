// Generated by view binder compiler. Do not edit!
package com.grzeluu.plantcareapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.grzeluu.plantcareapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentAddPlantBinding implements ViewBinding {
  @NonNull
  private final NestedScrollView rootView;

  @NonNull
  public final CardView cardView;

  @NonNull
  public final EditText etName;

  @NonNull
  public final LayoutFertilizingSettingsBinding fertilizingSettings;

  @NonNull
  public final ImageView ivPhoto;

  @NonNull
  public final LinearLayout linearLayout;

  @NonNull
  public final LayoutSprayingSettingsBinding sprayingSettings;

  @NonNull
  public final ToolbarAddPlantBinding toolbar;

  @NonNull
  public final LayoutWateringSettingsBinding wateringSettings;

  private FragmentAddPlantBinding(@NonNull NestedScrollView rootView, @NonNull CardView cardView,
      @NonNull EditText etName, @NonNull LayoutFertilizingSettingsBinding fertilizingSettings,
      @NonNull ImageView ivPhoto, @NonNull LinearLayout linearLayout,
      @NonNull LayoutSprayingSettingsBinding sprayingSettings,
      @NonNull ToolbarAddPlantBinding toolbar,
      @NonNull LayoutWateringSettingsBinding wateringSettings) {
    this.rootView = rootView;
    this.cardView = cardView;
    this.etName = etName;
    this.fertilizingSettings = fertilizingSettings;
    this.ivPhoto = ivPhoto;
    this.linearLayout = linearLayout;
    this.sprayingSettings = sprayingSettings;
    this.toolbar = toolbar;
    this.wateringSettings = wateringSettings;
  }

  @Override
  @NonNull
  public NestedScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentAddPlantBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentAddPlantBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_add_plant, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentAddPlantBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cardView;
      CardView cardView = ViewBindings.findChildViewById(rootView, id);
      if (cardView == null) {
        break missingId;
      }

      id = R.id.et_name;
      EditText etName = ViewBindings.findChildViewById(rootView, id);
      if (etName == null) {
        break missingId;
      }

      id = R.id.fertilizing_settings;
      View fertilizingSettings = ViewBindings.findChildViewById(rootView, id);
      if (fertilizingSettings == null) {
        break missingId;
      }
      LayoutFertilizingSettingsBinding binding_fertilizingSettings = LayoutFertilizingSettingsBinding.bind(fertilizingSettings);

      id = R.id.iv_photo;
      ImageView ivPhoto = ViewBindings.findChildViewById(rootView, id);
      if (ivPhoto == null) {
        break missingId;
      }

      id = R.id.linearLayout;
      LinearLayout linearLayout = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout == null) {
        break missingId;
      }

      id = R.id.spraying_settings;
      View sprayingSettings = ViewBindings.findChildViewById(rootView, id);
      if (sprayingSettings == null) {
        break missingId;
      }
      LayoutSprayingSettingsBinding binding_sprayingSettings = LayoutSprayingSettingsBinding.bind(sprayingSettings);

      id = R.id.toolbar;
      View toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }
      ToolbarAddPlantBinding binding_toolbar = ToolbarAddPlantBinding.bind(toolbar);

      id = R.id.watering_settings;
      View wateringSettings = ViewBindings.findChildViewById(rootView, id);
      if (wateringSettings == null) {
        break missingId;
      }
      LayoutWateringSettingsBinding binding_wateringSettings = LayoutWateringSettingsBinding.bind(wateringSettings);

      return new FragmentAddPlantBinding((NestedScrollView) rootView, cardView, etName,
          binding_fertilizingSettings, ivPhoto, linearLayout, binding_sprayingSettings,
          binding_toolbar, binding_wateringSettings);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
