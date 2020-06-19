(ns four-clojure-solutions.medium.50-test
  (:require [clojure.test :refer :all]
            [four-clojure-solutions.medium.50 :refer [split-type]]))

(deftest flip-test
  (testing "Test #1"
    (is (= (set (split-type [1 :a 2 :b 3 :c])) #{[1 2 3] [:a :b :c]})))
  (testing "Test #2"
    (is (= (set (split-type [:a "foo"  "bar" :b])) #{[:a :b] ["foo" "bar"]})))
  (testing "Test #3"
    (is (= (set (split-type [[1 2] :a [3 4] 5 6 :b])) #{[[1 2] [3 4]] [:a :b] [5 6]}))))
