(set-env!
 :source-paths   #{"src" "test"}
 :dependencies '[[org.clojure/clojure "1.6.0" :scope "provided"]
                 [boot/core "2.0.0" :scope "test"]
                 [adzerk/bootlaces "0.1.11" :scope "test"]
                 [adzerk/boot-test "1.0.4" :scope "test"]])

(require '[adzerk.bootlaces :refer :all]
         '[adzerk.boot-test :refer :all]
         '[mbuczko.boot-ragtime :refer [ragtime]])

(def +version+ "0.1.3")

(bootlaces! +version+)

(task-options!
 pom {:project 'mbuczko/boot-ragtime
      :version +version+
      :description "Run ragtime migrations in boot."
      :url "https://github.com/mbuczko/boot-ragtime"
      :scm {:url "https://github.com/mbuczko/boot-ragtime"}
      :license {"name" "GNU Lesser General Public License"
                "url" "http://www.gnu.org/licenses/lgpl.txt"}}
 test {:namespaces #{'mbuczko.boot-ragtime.test}})
