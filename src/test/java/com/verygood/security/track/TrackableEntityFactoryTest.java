package com.verygood.security.track;

import com.verygood.security.track.data.Action;
import com.verygood.security.track.entity.Client;

import org.junit.Ignore;
import org.junit.Test;

public class TrackableEntityFactoryTest {
  @Test
  @Ignore //todo: not implemented yet
  public void shouldCreateTrackableEntity() {
    Client client = new Client();

    TrackableEntityFactory.createTrackableEntity(
        1L,
        client,
        new Object[]{1L, },
        new Object[]{},
        new String[]{},
        Action.SAVE
    );
  }
}
