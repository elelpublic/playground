/*
 * This Spock specification was auto generated by running 'gradle init --type groovy-library'
 * by 'lars' at '03.03.15 14:37' with Gradle 2.1
 *
 * @author lars, @date 03.03.15 14:37
 */

import spock.lang.Specification

class MainTest extends Specification{
    def "someLibraryMethod returns true"() {
        setup:
        Library lib = new Library()
        when:
        def result = lib.someLibraryMethod()
        then:
        result == true
    }
}
