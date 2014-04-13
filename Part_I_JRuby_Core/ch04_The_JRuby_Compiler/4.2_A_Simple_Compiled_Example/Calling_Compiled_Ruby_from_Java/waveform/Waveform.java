

import org.jruby.Ruby;
import org.jruby.RubyObject;
import org.jruby.runtime.Helpers;
import org.jruby.runtime.builtin.IRubyObject;
import org.jruby.javasupport.JavaUtil;
import org.jruby.RubyClass;


public class Waveform extends RubyObject  {
    private static final Ruby __ruby__ = Ruby.getGlobalRuntime();
    private static final RubyClass __metaclass__;

    static {
        String source = new StringBuilder("class Waveform\n" +
            "  def initialize(points)\n" +
            "    @points = points\n" +
            "  end\n" +
            "\n" +
            "  def rms\n" +
            "    raise 'No points' unless @points.length > 0\n" +
            "    squares = @points.map {|p| p * p}\n" +
            "    sum     = squares.inject {|s, p| s + p}\n" +
            "    mean    = sum / squares.length\n" +
            "    Math.sqrt(mean)\n" +
            "  end\n" +
            "end\n" +
            "").toString();
        __ruby__.executeScript(source, "waveform.rb");
        RubyClass metaclass = __ruby__.getClass("Waveform");
        if (metaclass == null) throw new NoClassDefFoundError("Could not load Ruby class: Waveform");
        metaclass.setRubyStaticAllocator(Waveform.class);
        __metaclass__ = metaclass;
    }

    /**
     * Standard Ruby object constructor, for construction-from-Ruby purposes.
     * Generally not for user consumption.
     *
     * @param ruby The JRuby instance this object will belong to
     * @param metaclass The RubyClass representing the Ruby class of this object
     */
    private Waveform(Ruby ruby, RubyClass metaclass) {
        super(ruby, metaclass);
    }

    /**
     * A static method used by JRuby for allocating instances of this object
     * from Ruby. Generally not for user comsumption.
     *
     * @param ruby The JRuby instance this object will belong to
     * @param metaclass The RubyClass representing the Ruby class of this object
     */
    public static IRubyObject __allocate__(Ruby ruby, RubyClass metaClass) {
        return new Waveform(ruby, metaClass);
    }

    
    public  Waveform(Object points) {
        this(__ruby__, __metaclass__);
        IRubyObject ruby_arg_points = JavaUtil.convertJavaToRuby(__ruby__, points);
        Helpers.invoke(__ruby__.getCurrentContext(), this, "initialize", ruby_arg_points);

    }

    
    public Object rms() {

        IRubyObject ruby_result = Helpers.invoke(__ruby__.getCurrentContext(), this, "rms");
        return (Object)ruby_result.toJava(Object.class);

    }

}
