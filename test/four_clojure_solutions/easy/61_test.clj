(ns four-clojure-solutions.easy.61-test
  (:require [clojure.test :refer :all]
            [four-clojure-solutions.easy.61 :refer [map-constructor]]))

(deftest map-constructor-test
  (testing "Test #1"
    (is (= (map-constructor [:a :b :c] [1 2 3]) {:a 1, :b 2, :c 3})))
  (testing "Test #2"
    (is (= (map-constructor [1 2 3 4] ["one" "two" "three"]) {1 "one", 2 "two", 3 "three"})))
  (testing "Test #3"
    (is (= (map-constructor [:foo :bar] ["foo" "bar" "baz"]) {:foo "foo", :bar "bar"}))))
