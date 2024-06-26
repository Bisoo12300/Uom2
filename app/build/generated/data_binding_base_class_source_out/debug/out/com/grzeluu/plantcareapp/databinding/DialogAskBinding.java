// Generated by view binder compiler. Do not edit!
package com.grzeluu.plantcareapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.grzeluu.plantcareapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DialogAskBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final AppCompatButton btAskAQuestion;

  @NonNull
  public final EditText etAnswer;

  @NonNull
  public final EditText etQuestion;

  private DialogAskBinding(@NonNull LinearLayout rootView, @NonNull AppCompatButton btAskAQuestion,
      @NonNull EditText etAnswer, @NonNull EditText etQuestion) {
    this.rootView = rootView;
    this.btAskAQuestion = btAskAQuestion;
    this.etAnswer = etAnswer;
    this.etQuestion = etQuestion;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogAskBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogAskBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_ask, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogAskBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bt_ask_a_question;
      AppCompatButton btAskAQuestion = ViewBindings.findChildViewById(rootView, id);
      if (btAskAQuestion == null) {
        break missingId;
      }

      id = R.id.et_answer;
      EditText etAnswer = ViewBindings.findChildViewById(rootView, id);
      if (etAnswer == null) {
        break missingId;
      }

      id = R.id.et_question;
      EditText etQuestion = ViewBindings.findChildViewById(rootView, id);
      if (etQuestion == null) {
        break missingId;
      }

      return new DialogAskBinding((LinearLayout) rootView, btAskAQuestion, etAnswer, etQuestion);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
