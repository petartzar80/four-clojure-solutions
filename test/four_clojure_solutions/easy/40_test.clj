(ns four-clojure-solutions.easy.40-test
  (:require [clojure.test :refer :all]
            [four-clojure-solutions.easy.40 :refer [intrps]]))

(deftest intrps-test
  (testing "Test #1"
    (is (= (intrps 0 [1 2 3]) [1 0 2 0 3])))
  (testing "Test #2"
    (is (= (apply str (intrps ", " ["one" "two" "three"])) "one, two, three")))
  (testing "Test #3"
    (is (= (intrps :z [:a :b :c :d]) [:a :z :b :z :c :z :d]))))
