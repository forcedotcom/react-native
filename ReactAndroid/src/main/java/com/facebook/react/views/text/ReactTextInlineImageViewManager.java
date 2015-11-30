/**
 * Copyright (c) 2015-present, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */

package com.facebook.react.views.text;

import android.view.View;

import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewManager;

/**
 * Manages Images embedded in Text nodes. Since they are used only as a virtual nodes any type of
 * native view operation will throw an {@link IllegalStateException}
 */
public class ReactTextInlineImageViewManager
    extends ViewManager<View, ReactTextInlineImageShadowNode> {

  static final String REACT_CLASS = "RCTTextInlineImage";

  @Override
  public String getName() {
    return REACT_CLASS;
  }

  @Override
  public View createViewInstance(ThemedReactContext context) {
    throw new IllegalStateException("RCTTextInlineImage doesn't map into a native view");
  }

  @Override
  public ReactTextInlineImageShadowNode createShadowNodeInstance() {
    return new ReactTextInlineImageShadowNode();
  }

  @Override
  public Class<ReactTextInlineImageShadowNode> getShadowNodeClass() {
    return ReactTextInlineImageShadowNode.class;
  }

  @Override
  public void updateExtraData(View root, Object extraData) {
  }

}
