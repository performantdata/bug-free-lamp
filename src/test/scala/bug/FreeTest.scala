package bug

class FreeTest extends org.scalatest.FreeSpec {
  "A lamp must equal 1" in {
    assert(Free.lamp == 1)
  }
}
