package io.hexlet.xo.controllers;

import io.hexlet.xo.model.Field;
import io.hexlet.xo.model.Point;

public class MoveController {

  public boolean applyFigure(final Field field,
                            final Point point,
                            final String figure) {
    if (checkCoordinate(point.x, field.getSize()) && checkCoordinate(point.y, field.getSize()) && field.getFigure(point) == null) {
      field.setFigure(point, figure);
      return true;
    }
    return false;
  }

  private boolean checkCoordinate(final int x, final int size) {
    return x > 0 && x < size;
  }

}
