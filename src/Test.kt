import global
import lib.process.Shell

fun main(args: Array<String>) {
	val sh = Shell()
	sh.ready()
	val r = sh.run(args[0], 200, 0)
	global.log("$r")
}
