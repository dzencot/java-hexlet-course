package io.hexlet.xo.model;

public class Field {

  private static final int SIZE_FIELD = 3;

  public String[][] figures = new String[SIZE_FIELD][SIZE_FIELD];

  public int getSize() {
    return this.figures.length;
  }

  public String getFigure(final Point point) {
    return this.figures[point.x][point.y];
  }

  public void setFigure(final Point point, final String figure) {
    this.figures[point.x][point.y] = figure;
  }

}

