package com.example.gratitude_share_app.app.web.form;

import jakarta.validation.GroupSequence;

@GroupSequence({RequiredGroup.class, OtherGroup.class})
public interface GroupOrder {
}
