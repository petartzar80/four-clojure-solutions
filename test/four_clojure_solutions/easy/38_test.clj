(ns four-clojure-solutions.easy.38-test
  (:require [clojure.test :refer :all]
            [four-clojure-solutions.easy.38 :refer [max-val]]))

(deftest max-val-test
  (testing "Test #1"
    (is (= (max-val 1 8 3 4) 8)))
  (testing "Test #2"
    (is (= (max-val 30 20) 30)))
  (testing "Test #4"
    (is (= (max-val 45 67 11) 67))))
