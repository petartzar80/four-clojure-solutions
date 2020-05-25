(ns four-clojure-solutions.easy.23-test
  (:require [clojure.test :refer :all]
            [four-clojure-solutions.easy.23 :refer [rev]]))

(deftest rev-test
  (testing "Test #1"
    (is (= (rev [1 2 3 4 5]) [5 4 3 2 1])))
  (testing "Test #2"
    (is (= (rev (sorted-set 5 7 2 7)) '(7 5 2))))
  (testing "Test #3"
    (is (= (rev [[1 2] [3 4] [5 6]]) [[5 6] [3 4] [1 2]]))))
