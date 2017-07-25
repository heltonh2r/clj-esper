(defproject clj-esper/clj-esper "1.0.2-SNAPSHOT" 
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [com.espertech/esper "6.1.0" :exclusions [log4j]]]
  :description "Simple Esper wrapper for Clojure")
