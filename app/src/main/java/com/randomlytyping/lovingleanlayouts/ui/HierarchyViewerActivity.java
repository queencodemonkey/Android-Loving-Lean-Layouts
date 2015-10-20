/*
 * Copyright (C) 2015 Randomly Typing LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.randomlytyping.lovingleanlayouts.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.randomlytyping.lovingleanlayouts.R;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * @since 2015.10.18
 */
public class HierarchyViewerActivity extends AppCompatActivity {
    //
    // Fields
    //
    @Bind(R.id.status_message)
    TextView statusTextView;

    //
    // Activity lifecycle
    //

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_hierarchy_viewer);

        ButterKnife.bind(this);

        final Toolbar toolbar = ButterKnife.findById(this, R.id.app_bar);
        setSupportActionBar(toolbar);

        statusTextView.setText(R.string.hierarchy_viewer_status_bar_message_sample);
    }
}
