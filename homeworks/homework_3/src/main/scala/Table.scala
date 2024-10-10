import scala.collection.mutable

class Table(val width: Int, val height: Int) {
    private val cells: mutable.Map[(Int, Int), Cell] = mutable.Map().withDefaultValue(new EmptyCell)

    def getCell(ix: Int, iy: Int): Option[Cell] = {
        if (ix >= 0 && ix < width && iy >= 0 && iy < height) {
            Some(cells((ix, iy)))
        } else {
            None
        }
    }

    def setCell(ix: Int, iy: Int, cell: Cell): Unit = {
        if (ix >= 0 && ix < width && iy >= 0 && iy < height) {
            cells((ix, iy)) = cell
        }
    }
}