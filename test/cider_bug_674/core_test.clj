(ns cider-bug-674.core-test
  (:require [clojure.test :refer :all]
            [cider-bug-674.core :refer :all]))

(deftest a-test
  (testing "I fail."
    (throw-error)))
