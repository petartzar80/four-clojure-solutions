(ns four-clojure-solutions.medium.55-test
  (:require [clojure.test :refer :all]
            [four-clojure-solutions.medium.55 :refer [occurences]]))

(deftest occurences-test
  (testing "Test #1"
    (is (= (occurences [1 1 2 3 2 1 1]) {1 4, 2 2, 3 1})))
  (testing "Test #2"
    (is (= (occurences [:b :a :b :a :b]) {:a 2, :b 3})))
  (testing "Test #3"
    (is (= (occurences '([1 2] [1 3] [1 3])) {[1 2] 1, [1 3] 2}))))
